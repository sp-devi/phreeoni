package phr.org.co.jp.phreeoni

import org.springframework.boot.autoconfigure.SpringBootApplication
import phr.org.co.jp.phreeoni.domain.ocr.OCRecognizer
import java.io.File

@SpringBootApplication
class PhreeoniApplication

fun main(args: Array<String>) {
   //  runApplication<PhreeoniApplication>(*args)
    println("Starting image ocr...")
    var imageFile = File("/home/spdevi/Pictures/conan_ocr_sample_1.png")
    var ocrController = OCRecognizer(imageFile)
    ocrController.processImageFile()
}
