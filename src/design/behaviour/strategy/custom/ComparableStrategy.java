package design.behaviour.strategy.custom;

/**
 * 策略模式
 * 
 * @Title: StrategyComparable.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>比较接口
 *               功能概述：一种编程策略，对于底层函数不确定的时候，只制定一个接口，具体方法交给实现类去做 <br>
 *               策略模式的优点 :　　<br>
 *               （1）策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。 　　<br>
 *               （2）使用策略模式可以避免使用多重条件(if-else)语句。多重条件语句不易维护，它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统统列在一个多重条件语句里面，比使用继承的办法还要原始和落后。<br>
 *               策略模式的缺点 :　　<br>
 *               （1）客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。 　　<br>
 *               （2）由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。
 * @Created on 2015年8月5日 下午2:17:08
 * @author yangkai
 */
public interface ComparableStrategy<T> {

    public int compareTo(T o);
}
