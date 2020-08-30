/**
 * @作者 leokkzhang
 * @创建时间 2020/8/16 0:34
 */
package io.github.talelin.latticy.service;

import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.model.BannerDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestSleeveService {

    @Autowired
    private BannerMapper bannerMapper;

    public List<BannerDO> getBanners(){
        return bannerMapper.getAllBanner();
    }

    public Long insertBanner(){
        BannerDO bannerDO = new BannerDO();
        bannerDO.setName("NewBanner");
        bannerDO.setTitle("NewBannerTitle");

        bannerMapper.insertBanner(bannerDO);

        return bannerDO.getId();
    }
}
