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

package com.skplanet.jose.jwe;

import com.skplanet.jose.JoseHeader;
import com.skplanet.jose.jwa.suites.JweAlgorithmSuites;

/**
 * Created by byeongchan.park@sk.com(1000808) on 2015-12-22.
 */
public class JweHeader extends JoseHeader {
	public JweHeader(JweAlgorithmSuites jweAlgorithmSuites) {
		super();
		setDefaultHeader(jweAlgorithmSuites.getKeyWrapAlgorithm(), jweAlgorithmSuites.getContentEncryptionAlgorithm(),
				null);
	}

	public JweHeader(JweAlgorithmSuites jweAlgorithmSuites, String kid) {
		setDefaultHeader(jweAlgorithmSuites.getKeyWrapAlgorithm(), jweAlgorithmSuites.getContentEncryptionAlgorithm(), kid);
	}
}
