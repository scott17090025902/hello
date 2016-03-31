package alpha.scott.test.service;

import alpha.scott.test.dao.T_NameDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gst on 2016/3/31.
 */
@Service
public class T_NameService {
    @Autowired
    private T_NameDAO t_nameDAO;

    public void select(){
        t_nameDAO.selectNameById(1);
    }
}
