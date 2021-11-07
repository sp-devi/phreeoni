package phr.org.co.jp.phreeoni.domain.ocr

import org.xml.sax.*
import org.xml.sax.helpers.DefaultHandler
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory

class Parser {

    fun getElement() {
        val parserFactory = SAXParserFactory.newInstance()
        val parser = parserFactory.newSAXParser()
        val defaultHandler = object : DefaultHandler() {
            var currentValue = ""
            var currentElement = ""

            override fun startElement(uri: String?, localName: String?, qName: String?, attributes: Attributes?) {
                super.startElement(uri, localName, qName, attributes)
            }
        }
    }

    fun readResult() {

    }

}