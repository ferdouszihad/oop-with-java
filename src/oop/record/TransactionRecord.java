package oop.record;

import java.time.LocalDateTime;

public record TransactionRecord(int amount , String type, int from , int to , LocalDateTime timeStamp) {
}

