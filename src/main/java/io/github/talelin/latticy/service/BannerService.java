/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020/8/23 19:42
 */
package io.github.talelin.latticy.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.github.talelin.latticy.bo.BannerWithItemsBO;
import io.github.talelin.latticy.dto.BannerDTO;
import io.github.talelin.latticy.model.BannerDO;

public interface BannerService extends IService<BannerDO> {

    void update(BannerDTO dto, Long id);
    void delete(Long id);
    BannerWithItemsBO getWithItems(Long id);

}
