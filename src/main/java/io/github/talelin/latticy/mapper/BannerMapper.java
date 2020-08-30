/**
 * @作者 leokkzhang
 * @创建时间 2020/8/16 0:36
 */
package io.github.talelin.latticy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.model.BannerDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper extends BaseMapper<BannerDO> {

    List<BannerDO> getAllBanner();

    @Select("select * from banner;")
    List<BannerDO> getAllBanner1();

    Long insertBanner(BannerDO bannerDO);
}
