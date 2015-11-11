package com.skplanet.jose.jws;

import com.skplanet.jose.JoseHeader;
import com.skplanet.jose.commons.codec.binary.Base64;
import com.skplanet.jose.jwa.Jwa;
import com.skplanet.jose.jwa.crypto.CryptoUtils;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by 박병찬 on 2015-07-15.
 */
public class JwsSignerSha256WithECDSATest {
	/*
{"kty":"EC",
"crv":"P-256",
"x":"f83OJ3D2xF1Bg8vub9tLe1gHMzV76e8Tus9uPHvRVEU",
"y":"x_FEzRu9m36HLN_tue659LNpXW6pCyStikYjKIWI5a0",
"d":"jpsQnnGQmL-YBIffH1136cspYG6-0iY7X1fCE9-E9LI"
}
*/

	ECPublicKey publicKey;
	ECPrivateKey privateKey;

	@Before
	public void setUp() throws Exception {
		String x = "f83OJ3D2xF1Bg8vub9tLe1gHMzV76e8Tus9uPHvRVEU";
		String y = "x_FEzRu9m36HLN_tue659LNpXW6pCyStikYjKIWI5a0";
		String d = "jpsQnnGQmL-YBIffH1136cspYG6-0iY7X1fCE9-E9LI";

		publicKey = CryptoUtils.generateEcPublicKey(Base64.decodeBase64(x), Base64.decodeBase64(y));
		privateKey = CryptoUtils.generateEcPrivateKey(Base64.decodeBase64(d));
	}

	@Test
	public void testCompactSerialize() {
		String payload = "{\"iss\":\"joe\",\n" + "   \"exp\":1300819380,\n" + "   \"http://example.com/is_root\":true}";

		JwsSerializer jwsSerializer = new JwsSerializer(new JoseHeader(Jwa.ES256), payload, privateKey.getEncoded());
		String actual = jwsSerializer.compactSerialization();

		System.out.println(actual);

	}
}