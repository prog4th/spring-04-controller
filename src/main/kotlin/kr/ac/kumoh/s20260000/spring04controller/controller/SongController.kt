package kr.ac.kumoh.s20260000.spring04controller.controller

import kr.ac.kumoh.s20260000.spring04controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(
    private val service: SongService
) {
    @GetMapping("/songs")
    fun getSongs() = service.getAllSongs()
}