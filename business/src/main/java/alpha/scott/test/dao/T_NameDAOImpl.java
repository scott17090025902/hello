package alpha.scott.test.dao;

import alpha.scott.test.model.t_name;
import com.alibaba.cobarclient.BaseSqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by gst on 2016/3/31.
 */
@Repository
public class T_NameDAOImpl extends BaseSqlMapClientDaoSupport implements T_NameDAO{
    @Override
    public String selectNameById(int i) {
        t_name result = (t_name)getSqlMapClientTemplate().queryForObject("t_name.Selectt_name",1);
        System.out.println("得到的结果是:"+result.getName());
        return result.getName();
    }
}
