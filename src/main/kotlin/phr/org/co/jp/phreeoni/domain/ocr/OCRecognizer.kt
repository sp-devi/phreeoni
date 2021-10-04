package phr.org.co.jp.phreeoni.domain.ocr

import net.sourceforge.tess4j.*;
import phr.org.co.jp.phreeoni.domain.common.Coordinate
import java.io.File

class OCRecognizer(private val imageFile: File) {

    fun processImageFileDemo() {
        readImageFile(imageFile)
    }

    fun readImageFile(imageFile: File): String {
        try {
            val tesseract = Tesseract();
            tesseract.setDatapath("/usr/share/tessdata")
            tesseract.setLanguage("jpn")
            tesseract.setHocr(true)
            return tesseract.doOCR(imageFile)
        } catch (e: Exception) {
            println(e)
            return ""
        }
    }

    fun parseBoundingBoxFromOCR(ocrResult: String): Coordinate {
        return Coordinate(-1f, -1f)
    }

    fun getAllRecognizedText(imageFile: File): String {
        var treal = readImageFile(imageFile)
        return ""
    }

    fun getAllRecognizedTextAndPosition(imageFile: File): Map<String, Map<String, Coordinate>> {
        return mapOf("" to mapOf("" to Coordinate(-1f, -1f)))
    }

    fun recognizeTextAt(position: Coordinate): String {
        return ""
    }

}