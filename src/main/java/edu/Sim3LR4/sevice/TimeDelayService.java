package edu.Sim3LR4.sevice;

import org.springframework.stereotype.Service;
import edu.Sim3LR4.model.Response;
import edu.Sim3LR4.model.Request;

@Service
public interface TimeDelayService {
    void timeDelay(Request request, Response response);
}
