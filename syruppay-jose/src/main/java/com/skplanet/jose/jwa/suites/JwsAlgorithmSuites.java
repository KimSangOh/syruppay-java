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

package com.skplanet.jose.jwa.suites;

import com.skplanet.jose.jwa.Jwa;

/**
 * Created by byeongchan.park@sk.com(1000808) on 2015-12-22.
 */
public enum JwsAlgorithmSuites {
	HS256(Jwa.HS256),
	RS256(Jwa.RS256);

	private Jwa signatureAlgorithm;

	private JwsAlgorithmSuites(Jwa signatureAlgorithm) {
		this.signatureAlgorithm = signatureAlgorithm;
	}

	public Jwa getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public boolean equals(JwsAlgorithmSuites jwsAlgorithmSuites) {
		if (jwsAlgorithmSuites != null && jwsAlgorithmSuites.getSignatureAlgorithm().equals(signatureAlgorithm)) {
			return true;
		}

		return false;
	}
}
