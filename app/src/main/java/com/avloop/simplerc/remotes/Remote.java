/*
 * Copyright 2016 Christo (christo.programmer@gmail.com)
 * This file is part of SimpleRC.
 *

 * SimpleRC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.

 * FileOrganizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with FileOrganizer.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.avloop.simplerc.remotes;

import android.hardware.ConsumerIrManager;
import android.util.Log;

import java.util.Arrays;


public abstract class Remote {
    private ConsumerIrManager irManager;
    private static final String TAG = "RemoteCommon";
    /*Return  - pattern with first element frequency, and subsequent elements duration in ms*/
    abstract int[] getPattern(int keyCode);
    public void sentIR( int keyCode){
        int [] pattern = getPattern(keyCode);
        if (null == pattern){
            throw new UnsupportedOperationException();
        }
        int freq = pattern[0];
        int [] duration = new int[pattern.length -1];
        System.arraycopy(pattern, 1, duration, 0, duration.length);
        ConsumerIrManager.CarrierFrequencyRange[] frequencyRange = irManager.getCarrierFrequencies();
        for ( int i = 0; i< frequencyRange.length; i++) {
            Log.i(TAG, "Count "+i+" min "+frequencyRange[i].getMinFrequency()+" max "+frequencyRange[i].getMaxFrequency());
        }
        Log.i(TAG, "Sending remote freq  = " + freq + " duration = " + Arrays.toString(duration));
        irManager.transmit(freq, duration);
    }
    public Remote( ConsumerIrManager irManager){
        this.irManager = irManager;
    }
}
