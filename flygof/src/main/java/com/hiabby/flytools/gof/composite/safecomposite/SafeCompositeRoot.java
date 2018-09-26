package com.hiabby.flytools.gof.composite.safecomposite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @desc
 * @date 2018/09/26
 **/
public class SafeCompositeRoot extends SafeComponent {
    private List<SafeComponent> sc = Lists.newArrayList();

    public SafeCompositeRoot(String name) {
        super(name);
    }

    public void add(SafeComponent op) {
        sc.add(op);
    }

    public void remove(SafeComponent op) {
        sc.remove(op);
    }

    @Override
    public void show(int depth) {
        System.out.println(name);

        sc.forEach(x -> {
            for (int i = 0; i < depth; i++) {
                System.out.print("\t");
            }
            x.show(depth + 1);
        });
    }
}
