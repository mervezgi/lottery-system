package com.spring.service;

import com.spring.exception.ResourceNotFoundException;
import com.spring.exception.UnableToSubmitLotteryTicket;
import com.spring.model.LotteryTicket;

public interface LotteryTicketService {

    LotteryTicket submitLotteryTicketSync(Long lotteryId, String username) throws ResourceNotFoundException, UnableToSubmitLotteryTicket;

    Long selectRandomLotteryWinner(Long lotteryId) throws ResourceNotFoundException;
}
