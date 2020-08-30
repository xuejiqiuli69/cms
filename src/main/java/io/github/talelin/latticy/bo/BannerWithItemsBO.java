/**
 * @作者 leokkzhang
 * @创建时间 2020/8/29 17:47
 */
package io.github.talelin.latticy.bo;

import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.model.BannerItemDO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@NoArgsConstructor
public class BannerWithItemsBO {

    private Long id;
    private String name;
    private String description;
    private String title;
    private String img;

    List<BannerItemDO> items;

    public BannerWithItemsBO(BannerDO banner,List<BannerItemDO> items){
        BeanUtils.copyProperties(banner,this);
        this.items = items;
    }

}
