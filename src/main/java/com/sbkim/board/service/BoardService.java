package com.sbkim.board.service;

import com.sbkim.board.entity.Board;
import com.sbkim.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 글 작성 처리
    public void write(Board board, MultipartFile file) {

        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files";
        UUID uuid = UUID.randomUUID();

        String fileName = uuid + "_" + file.getOriginalFilename();

        File saveFile = new File(projectPath, fileName);
        try {
            file.transferTo(saveFile);

            board.setFileName(fileName);
            board.setFilePath("/files/" + fileName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boardRepository.save(board);
    }

    // 게시글 리스트 처리
    public Page<Board> boardList(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    // 게시글 리스트 검색
    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable) {
        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }

    // 특정 게시글 불러오기
    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }

    // 특정 게시글 삭제
    public void boardDelete(Integer id) {
        boardRepository.deleteById(id);
    }
}
