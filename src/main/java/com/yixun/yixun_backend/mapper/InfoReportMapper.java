package com.yixun.yixun_backend.mapper;

import com.yixun.yixun_backend.dto.ClueRepoInfoDTO;
import com.yixun.yixun_backend.entity.CluesReport;
import com.yixun.yixun_backend.entity.InfoReport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author hunyingzhong
* @description 针对表【yixun_info_report】的数据库操作Mapper
* @createDate 2022-12-03 12:43:39
* @Entity com.yixun.yixun_backend.domain.InfoReport
*/
public interface InfoReportMapper extends BaseMapper<InfoReport> {
    List<ClueRepoInfoDTO> cutIntoInfoRepoList(List<InfoReport> records);

}




