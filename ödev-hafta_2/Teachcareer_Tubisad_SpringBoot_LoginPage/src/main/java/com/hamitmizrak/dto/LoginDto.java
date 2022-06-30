package com.hamitmizrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDto {
    private Long LoginId;

    @NotEmpty(message = "email boş geçilemez")
    @Email(message = "uygun formatta email girmediniz examples: deneme@com")
    private String loginEmail;

    @NotEmpty(message = "Password bos geçilemez")
    private String loginPassword;

    public String getNowDate(){
        Locale local=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",local);
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
    private String creationDate=getNowDate();
}

