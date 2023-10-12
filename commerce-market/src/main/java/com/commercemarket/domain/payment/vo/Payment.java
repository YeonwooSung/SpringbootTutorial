package com.commercemarket.domain.payment.vo;

import com.commercemarket.controller.payment.dto.PaymentResponseDto;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long id;
    private String impUid;
    private String merchantUid;
    private String payMethod;
    private BigDecimal amount;
    private String status;
    private LocalDateTime paidAt;
    private LocalDateTime failedAt;
    private LocalDateTime cancelledAt;
    private String receiptUrl;
    private String pgProvider;
    private String buyerName;
    private boolean success;

    public PaymentResponseDto toPaymentResponseDto() {
        return PaymentResponseDto.builder()
                .id(id)
                .impUid(impUid)
                .merchantUid(merchantUid)
                .payMethod(payMethod)
                .amount(amount)
                .status(status)
                .paidAt(paidAt)
                .failedAt(failedAt)
                .cancelledAt(cancelledAt)
                .receiptUrl(receiptUrl)
                .pgProvider(pgProvider)
                .buyerName(buyerName)
                .success(success)
                .build();
    }
}
