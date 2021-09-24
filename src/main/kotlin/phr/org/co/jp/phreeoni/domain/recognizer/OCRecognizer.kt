package phr.org.co.jp.phreeoni.domain.recognizer

import net.sourceforge.tess4j.*;
import java.io.File

class OCRecognizer (private val imageFile: File) {

    fun processImageFile() {
        try {
            val tesseract = Tesseract();
            tesseract.setDatapath("/usr/share/tessdata")
            tesseract.setLanguage("jpn")
            tesseract.setHocr(true)
            val result = tesseract.doOCR(imageFile)
            println(result)
        } catch(e : Exception) {
            println(e)
        }
    }

}