package kr.ac.kumoh.s20260000.spring04controller.service

import kr.ac.kumoh.s20260000.spring04controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song> {
        return listOf(
            Song(1, "Golden", "HUNTR/X")
        )
    }
}