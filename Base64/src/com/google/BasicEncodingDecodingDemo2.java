package com.google;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class BasicEncodingDecodingDemo2 {

	public static void main(String[] args) {
//		Getting encoder and decoder
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
//		Encoding string
		String str = encoder.encodeToString("Base64 Encoding Decoding added in Java8".getBytes());
		System.out.println("Encoded string: "+str);
		
//		Decoding string
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoding string: "+dStr);
	}
}