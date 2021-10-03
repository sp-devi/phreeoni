package phr.org.co.jp.phreeoni

import org.springframework.boot.autoconfigure.SpringBootApplication
import phr.org.co.jp.phreeoni.domain.ocr.OCRecognizer
import java.io.File

@SpringBootApplication
class PhreeoniApplication

fun main(args: Array<String>) {
   //  runApplication<PhreeoniApplication>(*args)
    println("Starting image ocr...")
    val imageFile = File("/tmp/Screenshot_20210910_115900.png")
    val ocrController = OCRecognizer(imageFile)
    ocrController.processImageFileDemo()
}
