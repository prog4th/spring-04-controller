package kr.ac.kumoh.s20260000.spring04controller.service

import kr.ac.kumoh.s20260000.spring04controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(
    private val repository: SongRepository
) {
    fun getAllSongs() = repository.findAll()
}