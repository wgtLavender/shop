package com.seventh.shop.controller;

import com.seventh.shop.domain.Activity;
import com.seventh.shop.service.ActivityService;
import com.seventh.shop.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author gfc
 * 2018年11月23日 下午 8:08
 */
@RestController
public class ActivityController {
    @Autowired
    private ActivityService service;

    @PostMapping("/api/v1/activity")
    public Result<Activity> addActivity(Activity activity) {

        return service.addActivity(activity);
    }

    @GetMapping("/api/v1/activities")
    public Result<List<Map<String, Object>>> findActivityTitle(HttpServletRequest request) {
        int sid = (int) request.getServletContext().getAttribute("sid");

        return service.findAllActivityTitle(sid);
    }

    @GetMapping("/api/v1/activity")
    public Result<Map<String, Object>> findActivityInfo(Integer proId) {
        System.out.println(proId);
        return service.findActivityInfo(proId);
    }
}
