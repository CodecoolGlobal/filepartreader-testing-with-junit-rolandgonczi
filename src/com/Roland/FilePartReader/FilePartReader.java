package com.Roland.FilePartReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilePartReader {
    private String filePath;
    private int fromLine;
    private int toLine;

    public FilePartReader() {
        setFilePath(data/test.txt);
        setFromLine(1);
        setToLine(1);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFromLine() {
        return fromLine;
    }

    public void setFromLine(Integer fromLine) {
        this.fromLine = fromLine;
    }

    public Integer getToLine() {
        return toLine;
    }

    public void setToLine(Integer toLine) {
        this.toLine = toLine;
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if (fromLine < 1) throw new IllegalArgumentException("Start line cannot be smaller than 1");
        if (toLine < fromLine) throw new IllegalArgumentException("Start line cannot be smaller than endline");
        setFilePath(filePath);
        setFromLine(fromLine);
        setToLine(toLine);
    }


}