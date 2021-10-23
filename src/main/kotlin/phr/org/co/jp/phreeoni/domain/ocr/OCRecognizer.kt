package phr.org.co.jp.phreeoni.domain.ocr

import net.sourceforge.tess4j.*;
import phr.org.co.jp.phreeoni.domain.common.Coordinate
import phr.org.co.jp.phreeoni.domain.common.UnitImageText
import java.io.File

class OCRecognizer(private val imageFile: File) {

    fun processImageFileDemo() {
        readImageFile(imageFile)
    }

    fun readImageFile(imageFile: File): String {
        return try {
            val ocrTess = Tesseract();
            ocrTess.setDatapath("/usr/share/tessdata")
            ocrTess.setLanguage("jpn")
            ocrTess.setHocr(true)
            ocrTess.doOCR(imageFile)
        } catch (e: Exception) {
            println(e)
            ""
        }
    }

    fun parseBoundingBoxFromOCR(ocrResult: String): Coordinate {
        return Coordinate(-1f, -1f)
    }

    fun retrieveBoundingBoxBasedOnLevel(xmlString: String, depthLevel: String): String {
        return ""
    }

    fun getAllRecognizedText(imageFile: File): String {
        var treatedResult = readImageFile(imageFile)
        return ""
    }

    // TODO: Expand these function
    fun getAllOcrResults(imageFile: File): Array<UnitImageText> {
        return arrayOf(UnitImageText(1, "", Coordinate(-1f, -1f)))
    }

    fun getAllRecognizedTextAndPosition(imageFile: File): Map<String, Map<String, Coordinate>> {
        return mapOf("" to mapOf("" to Coordinate(-1f, -1f)))
    }

    // No language support
    fun recognizeTextAt(position: Coordinate): String {
        return ""
    }

    fun getAllBoundingBox(ocrResult: String): Array<Coordinate> {
        val coordinate = parseBoundingBoxFromOCR(ocrResult);
        return arrayOf(coordinate);
    }

    // Language support should be abstracted one level higher than the domain component
    fun recognizeTextAt(position: Coordinate, language: String): String {
        return ""
    }
}