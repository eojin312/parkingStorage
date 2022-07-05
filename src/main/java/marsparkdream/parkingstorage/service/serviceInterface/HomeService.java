package marsparkdream.parkingstorage.service.serviceInterface;

import marsparkdream.parkingstorage.Model.dto.HomeReq;
import marsparkdream.parkingstorage.Model.dto.HomeResponse;

public interface HomeService {
    HomeResponse getHome(HomeReq homeReq);
}
