/**
 * @作者 leokkzhang
 * @创建时间 2020/8/23 20:57
 */
package io.github.talelin.latticy.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class BannerDTO {

    @NotBlank
    @Length(min = 2, max = 20)
    private String name;

    @Length(min = 2, max = 256)
    private String description;

    @Length(min = 2, max = 30)
    private String title;

    @Length(min = 2, max = 256)
    private String img;
}
