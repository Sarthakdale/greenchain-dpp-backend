package com.greenchain.dpp_engine.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayOutputStream;

public class QRCodeGenerator {

    // This method takes TEXT and turns it into an IMAGE (byte array)
    public static byte[] generateQRCode(String text, int width, int height) throws Exception {
        QRCodeWriter writer = new QRCodeWriter();

        // 1. Create the QR Matrix (the black and white squares)
        BitMatrix bitMatrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);

        // 2. Convert the Matrix to a PNG Image Stream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream);

        // 3. Return the image data
        return outputStream.toByteArray();
    }
}