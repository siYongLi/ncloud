package net.ninemm.upms.service.api;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import net.ninemm.upms.service.model.Dict;

import java.util.List;
import java.util.Map;

public interface DictService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public Dict findById(Object id);


    /**
     * find all model
     *
     * @return all <Dict
     */
    public List<Dict> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(Dict model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(Dict model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(Dict model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(Dict model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<? extends Model> paginate(int page, int pageSize);


    public void join(Page<? extends Model> page, String joinOnField);

    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);

    public void join(Page<? extends Model> page, String joinOnField, String joinName);

    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField);

    public void join(List<? extends Model> models, String joinOnField, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField, String joinName);

    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);

    public void join(Model model, String joinOnField);

    public void join(Model model, String joinOnField, String[] attrs);

    public void join(Model model, String joinOnField, String joinName);

    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);

    public void keep(List<? extends Model> models, String... attrs);

    public List<Dict> findListByDictType(String type);

    public String findDictNameByKey(String key);

    /**
     * 分页
     * @date  2019-01-31 13:30
     * @param page
     * @param pageSize
     * @param params
     * @return com.jfinal.plugin.activerecord.Page
     */
    public Page<Dict> paginate(int page, int pageSize, Map<String, Object> params);
}