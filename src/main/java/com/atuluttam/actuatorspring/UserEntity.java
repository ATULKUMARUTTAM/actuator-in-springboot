package com.atuluttam.actuatorspring;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class UserEntity {
    String id = "1";
    String name = "Atul";
    String email = "atul.uttam@geeksforgeeks.org";
}
