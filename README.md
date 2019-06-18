# 设计模式学习笔记
> 如果使程序设计达到可维护、可扩展、可复用、灵活性好，是每个程序设计者的基本要求，通过再次学习设计模式来使程序设计更加规范。

## 简单工厂模式（Factory）
> 客户端通过指定运算方式，经过简单工厂创建不同的运算对象。并通过将运算类抽象，让各个计算方法实现运算类并实现运算方法，计算最后结果。

* 使用场景：当需要实例化的多个不同实现类时，将实例化功能交给简单工厂去做统一实例化。
* 好处：外接不需要关心具体的实现类，通过简单工厂实例化不同的对象，方便后续的实例对象的扩展。

## 策略模式（Strategy）
> 策略模式是一种定义一些列算法的方法，运用多态性的特点，让不同的算法之间可以相互替换。

* 使用场景：不同的业务场景，应用不同的业务规则。
* 好处：
    1. 将不同的业务行为分离出来，进行封装，使这些行为类中消除条件语句。
    2. 有利于单元测试。
* 与简单工厂比较：简单工厂中需要客户端认识两个类（算法类和算法简单工厂类），而使用策略模式加简单工厂的方式，客户端只需要认识一个策略上下文即可，使得算法彻底与客户端分离。

## 单一职责原则
> 就一个类而言，应该仅有一个引起它变化的原因。

* 如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。并且这种耦合会导致脆弱的设计，当变化发生时，设计会遭受到意想不到的破坏。
* 软件设计真正要做的许多内容，就是发现职责并把那些职责相互分离。如果能够想到多于一个动机去改变一个类，那么这个类就具有多一个的职责，就应该考虑类的职责分离。

## 开放封闭原则
> 软件实体（类、模块、函数等）应该可以扩展，但是不可修改。

* 无论模块是多么的封闭，都会存在一些无法对之封闭的变化。既然不可能完全封闭，设计人员必须对于设计的模块应该对哪种变化封闭做出选择。必须先猜测出最有可能发生的变化种类，然后构造抽象来隔离那些变化。
* 等到变化时立即采取行动，创建抽象来隔离以后发生的同类变化。
* 面对需求，对程序的改动是通过增加代码进行的，而不是更改现有代码。

## 依赖倒转原则
> 依赖倒转其实可以说是面向对象设计的标识，用哪种语言来编写程序不重要，如果编写时考虑的都是如何针对抽象编程而不是针对细节编程，即程序中所有的依赖关系都是终止于抽象类或者接口，那就是面向对象的设计，反之那就是面向过程化的设计了。

* 高层模块不应该依赖低层模块。两个都应该依赖抽象。
* 抽象不应该依赖细节。细节应该依赖抽象。

## 装饰模式（Decorator）
> 为已有功能动态地添加更多功能的一种方式。

* 使用场景：当有仅在特定的场景下，才会使用到的特殊业务。适用于新增与主通用业务无关的特殊业务时进行功能扩展。
* 好处：
    1. 把核心功能与装饰功能分离，并在不修改核心功能的前提下，可以持续对核心功能进行扩展，简化原有核心类。
    2. 当客户端需要执行特殊行为时，可以按顺序地使用装饰功能包装对象。
    
## 代理模式（Proxy）
> 为其他对象提供一种代理以控制对这个对象的访问。

* 使用场景：需要隐藏一个对象的访问地址时，使用代理进行访问。在日常使用中，多用于对方法进行增强。
* 与装饰模式的对比：
    1. 都依赖于传入对象，装饰模式传入的是被装饰对象，代理模式传入的是被代理对象。
    2. 两者都可以对指定方法进行增强。
    3. 装饰模式可以通过在装饰抽象类中扩充抽象方法，通过实现类对原有被装饰类的方法得到扩充，而代理则不可以。
    4. 使用装饰模式，可以经过多个不同的装饰类进行装饰；而代理则总是只对真实类进行代理，只能代理一次。