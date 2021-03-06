package tk.ainiyue.danyuan.application.kejiju.xiangmu.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tk.ainiyue.danyuan.application.kejiju.xiangmu.po.KjxmDwxxInfo;

/**
 * 文件名 ： SysDatabaseDao.java
 * 包 名 ： tk.ainiyue.danyuan.application.dbm.addr.dao
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： wang
 * 时 间 ： 2017年8月3日 下午3:46:57
 * 版 本 ： V1.0
 */
@Repository("kjxmDwxxDao")
@DynamicUpdate(true)
@DynamicInsert(true)
public interface KjxmDwxxDao extends JpaRepository<KjxmDwxxInfo, Serializable> {
	
	/**  
	*  方法名： findAllByXmjbUuid  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param kjxmDwxxInfo
	*  参    数： @return 
	*  返    回： List<KjxmDwxxInfo>  
	*  作    者 ： wang  
	*  @throws  
	*/
	@Query("select t from KjxmDwxxInfo t where t.kjxmJbxxInfo.uuid =:xmjbUuid) ")
	List<KjxmDwxxInfo> findAllByXmjbUuid(@Param("xmjbUuid") String xmjbUuid);
	
	/**  
	*  方法名： findOneByUuid  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param uuid
	*  参    数： @return 
	*  返    回： KjxmDwxxInfo  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	@Query("select t from KjxmDwxxInfo t where t.uuid=:uuid) ")
	KjxmDwxxInfo findOneByUuid(@Param("uuid") String uuid);
	
}
