package com.example.demo.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repo;
    @Transactional(readOnly = true)
    public List<Bookmark> getBookmarks(){
        return repo.findAll();
    }
}
