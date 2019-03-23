package com.sergey.zhuravlev.auctionserver.converter;

import com.sergey.zhuravlev.auctionserver.dto.AccountResponseDto;
import com.sergey.zhuravlev.auctionserver.entity.Account;

public class AccountConverter {

    public static AccountResponseDto getAccountResponseDto(Account account) {
        if (account == null) return null;
        AccountResponseDto accountResponseDto = new AccountResponseDto();
        accountResponseDto.setUsername(account.getUsername());
        accountResponseDto.setFirstname(account.getFirstname());
        accountResponseDto.setLastname(account.getLastname());
        accountResponseDto.setPhoto(account.getPhoto().getName());
        accountResponseDto.setStars(account.getAverageStars());
        accountResponseDto.setBio(account.getBio());
        return accountResponseDto;
    }

}
