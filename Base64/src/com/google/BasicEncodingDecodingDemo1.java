package com.google;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class BasicEncodingDecodingDemo1 {

	public static void main(String[] args) {
//		Getting the encoder
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
//		Creating source byte array
		byte[] byteArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
//		Encoding byte array
		byte[] byteArr2 = encoder.encode(byteArr);
		System.out.println("Encoded byte array: ");
		for(byte b : byteArr2) {
			System.out.print(b+" ");
		}
		byte[] byteArr3 = new byte[60];
		int x = encoder.encode(byteArr, byteArr3);
		System.out.println("\nNumber of bytes written: "+x);
		
//		Decoding byte array
		byte[] decodedbyteArr = decoder.decode(byteArr2);
		System.out.println("\nDecoded byte Array: ");
		for(byte b : decodedbyteArr) {
			System.out.print(b+" ");
		}
	}
}