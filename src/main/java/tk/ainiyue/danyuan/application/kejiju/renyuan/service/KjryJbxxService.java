package tk.ainiyue.danyuan.application.kejiju.renyuan.service;

import java.util.List;

import org.springframework.data.domain.Page;

import tk.ainiyue.danyuan.application.kejiju.renyuan.po.KjryJbxxInfo;

public interface KjryJbxxService {
	
	/**  
	*  方法名： page  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param pageNumber
	*  参    数： @param pageSize
	*  参    数： @param info
	*  参    数： @return 
	*  返    回： Page<KjryJbxxInfo>  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	Page<KjryJbxxInfo> page(int pageNumber, int pageSize, KjryJbxxInfo info);
	
	/**  
	*  方法名： save  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param info 
	*  返    回： void  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	void save(KjryJbxxInfo info);
	
	/**  
	*  方法名： delete  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param list 
	*  返    回： void  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	void delete(List<KjryJbxxInfo> list);
	
	/**  
	*  方法名： dicJsly  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @return 
	*  返    回： List<String>  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	List<String> dicJsly();
	
	/**  
	*  方法名： dicZc  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @return 
	*  返    回： List<String>  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	List<String> dicZc();
	
	/**  
	*  方法名： dicSj  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @return 
	*  返    回： List<String>  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	List<String> dicXw();
	
	/**  
	*  方法名： findOne  
	*  功    能： TODO(这里用一句话描述这个方法的作用)  
	*  参    数： @param info
	*  参    数： @return 
	*  返    回： KjryJbxxInfo  
	*  作    者 ： Administrator  
	*  @throws  
	*/
	KjryJbxxInfo findOne(KjryJbxxInfo info);
	
}
