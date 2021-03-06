/*
 * Copyright (c) 2015 SK PLANET. ALL Rights Reserved.
 *
 * Syrup Pay Jose Library
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.skplanet.jose.util;

/**
 * Created by 박병찬 on 2015-08-13.
 */
public class ByteUtils {
	public static boolean equals(byte[] b1, byte[] b2) {
		if (b1.length != b2.length)
			return false;

		for (int i = 0; i < b1.length; i++) {
			if (b1[i] != b2[i])
				return false;
		}

		return true;
	}

	public static int getBitLength(byte[] b) {
		return b.length * 8;
	}

	public static byte[] firstHalf(byte[] b) {
		return subBytes(b, 0, b.length/2);
	}

	public static byte[] restHalf(byte[] b) {
		return subBytes(b, b.length/2, b.length/2);
	}

	public static byte[] subBytes(byte[] b, int offset, int length) {
		byte[] t = new byte[length];
		System.arraycopy(b, offset, t, 0, length);

		return t;
	}

	public static byte[] concat(byte[] b1, byte[] b2) {
		byte[] t = new byte[b1.length + b2.length];
		System.arraycopy(b1, 0, t, 0, b1.length);
		System.arraycopy(b2, 0, t, b1.length, b2.length);

		return t;
	}
}
