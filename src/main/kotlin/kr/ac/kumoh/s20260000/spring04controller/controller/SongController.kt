package kr.ac.kumoh.s20260000.spring04controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    @GetMapping("/songs")
    fun getSongs(): String {
        return "Golden"
    }
}