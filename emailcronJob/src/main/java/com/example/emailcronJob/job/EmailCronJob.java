package com.example.emailcronJob.job;

import com.example.emailcronJob.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailCronJob {

    private final EmailService emailService;

    @Scheduled(cron = "0 */10 * * * ?")
    public void sendDailyEmail() {
        emailService.sendEmail(
                "",
               "",
                ""
        );
    }
}
