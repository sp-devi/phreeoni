package phr.org.co.jp.phreeoni.domain.ocr

import net.sourceforge.tess4j.*;
import phr.org.co.jp.phreeoni.domain.common.Coordinate
import java.io.File

class OCRecognizer(private val imageFile: File) {

    fun processImageFileDemo() {
        try {
            val tesseract = Tesseract();
            tesseract.setDatapath("/usr/share/tessdata")
            tesseract.setLanguage("jpn")
            tesseract.setHocr(true)
            val result = tesseract.doOCR(imageFile)
            println(result)
        } catch (e: Exception) {
            println(e)
        }
    }

    fun readImageFile(): String {
        try {
            val tesseract = Tesseract();
            tesseract.setDatapath("/usr/share/tessdata")
            tesseract.setLanguage("jpn")
            tesseract.setHocr(true)
            return tesseract.doOCR(imageFile)
        } catch (e: Exception) {
            println(e)
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