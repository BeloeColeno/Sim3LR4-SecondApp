package edu.Sim3LR4.sevice;

import edu.Sim3LR4.model.Response;
import edu.Sim3LR4.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class TimeDelayServiceCounter implements TimeDelayService{
    @Override
    public void timeDelay(Request request, Response response){
        String systemTimeRequest = request.getSystemTime().substring(11,23);
        String systemTimeResponse = response.getSystemTime().substring(11,23);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

        try{
            Date date1 = format.parse(systemTimeRequest);
            Date date2 = format.parse(systemTimeResponse );

            long milliseconds = date2.getTime() - date1.getTime();

            log.info("Time Delay Service 1 by 2: " + milliseconds + " ms!");
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(systemTimeRequest);
    }
}
