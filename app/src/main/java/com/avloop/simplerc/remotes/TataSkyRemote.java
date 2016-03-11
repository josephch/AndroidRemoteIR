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
import com.avloop.simplerc.Keys;


public class TataSkyRemote extends Remote {
    private int[][] keyCodes;
    private static final String TAG = "TataSkyRemote";

    @Override
    public int[] getPattern(int keyCode) {

        return keyCodes[keyCode];
    }

    public TataSkyRemote( ConsumerIrManager irManager) {
        super(irManager);
        keyCodes = new int[Keys.MAX_KEYS][];
        for ( int i = 0; i < Keys.MAX_KEYS; i++)
        {
            switch ( i ) {
                case Keys.POWER:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 31, 15, 16, 32, 16, 15, 16, 3700 };
                    break;
                case Keys.INFO:
                    keyCodes[i] = new int[]{37000, };
                    break;
                case Keys.TV:
                    keyCodes[i] = new int[]{37000, };
                    break;
                case Keys.UP:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 16, 16, 16, 16, 31, 16, 31, 31, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 31, 31, 15, 16, 31, 16, 16, 16, 16, 16, 3700 };
                    break;
                case Keys.DOWN:
                    keyCodes[i] = new int[]{36000, 97, 32, 16, 16, 16, 16, 16, 31, 16, 31, 31, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 31, 31, 16, 16, 31, 16, 16, 32, 3600 };
                    break;
                case Keys.LEFT:
                    keyCodes[i] = new int[]{37000,97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 32, 31, 31, 15, 16, 32, 32, 32, 16, 3700 };
                    break;
                case Keys.RIGHT:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 32, 31, 31, 15, 16, 32, 31, 15, 16, 3700};
                    break;
                case Keys.SELECT:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 32, 31, 31, 15, 16, 15, 16, 32, 16, 15, 16, 3700 };
                    break;
                case Keys.GUIDE:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 31, 15, 16, 32, 16, 15, 31, 15, 16, 32, 16, 15, 16, 3700};
                    break;
                case Keys.PLANNER:
                    keyCodes[i] = new int[]{37000, };
                    break;
                case Keys.PAUSE:
                    keyCodes[i] = new int[]{37000,97, 34, 16, 15, 16, 15, 16, 31, 16, 31, 31, 16, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 32, 33, 16, 15, 32, 31, 16, 15, 16, 3700 };
                    break;
                case Keys.PLAY:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 31, 15, 16, 15, 16, 15, 16, 15, 16, 32, 16, 3700};
                    break;
                case Keys.REW:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 15, 16, 15, 16, 32, 16, 32, 31, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 31, 15, 16, 15, 16, 15, 16, 32, 32, 3700 };
                    break;
                case Keys.FF:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 16, 16, 16, 16, 31, 16, 31, 31, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 32, 32, 32, 16, 16, 16, 16, 16, 3700 };
                    break;
                case Keys.REC:
                    keyCodes[i] = new int[]{37000, };
                    break;
                case Keys.CHDOWN:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 16, 16, 16, 16, 31, 16, 31, 31, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 32, 16, 16, 16, 16, 16, 16, 32, 3700 };
                    break;
                case Keys.CHUP:
                    keyCodes[i] = new int[]{37000, 97, 33, 16, 15, 16, 15, 16, 31, 16, 31, 31, 16, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 16, 15, 32, 32, 16, 15, 16, 15, 16, 15, 16, 15, 16, 3700};
                    break;
                case Keys.BACK:
                    keyCodes[i] = new int[]{37000, 97, 32, 16, 16, 16, 16, 16, 32, 16, 32, 31, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 31, 16, 16, 16, 16, 16, 16, 16, 16, 31, 15, 16, 3700};
                    break;

            }
            /*Convert keycode into ms*/
            if ( null != keyCodes[i]) {
                for ( int j = 1; j< keyCodes[i].length; j++) {
                    int keyCodeMs = keyCodes[i][j]*1000000/keyCodes[i][0];
                    if ( keyCodeMs > 0) {
                        keyCodes[i][j] = keyCodeMs;
                    }
                }
            }
        }
    }

    /* Reference - http://stackoverflow.com/questions/20244337/consumerirmanager-api-19*/

}
