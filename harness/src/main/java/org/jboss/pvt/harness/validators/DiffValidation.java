package org.jboss.pvt.harness.validators;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:yyang@redhat.com">Yong Yang</a>
 */
public class DiffValidation extends Validation {

    private List<File> added = new ArrayList<>();
    private List<File> removed = new ArrayList<>();
    private Map<String, File[]> changed = new HashMap<>();
    private List<File> unchanged = new ArrayList<>();

    public DiffValidation(List<File> added, List<File> removed, List<File> unchanged, Map<String, File[]> changed) {
        super(false);
        this.added = added;
        this.removed = removed;
        this.unchanged = unchanged;
        this.changed = changed;
    }

    @Override
    public boolean isValid() {
        return added.isEmpty() && removed.isEmpty() && changed.isEmpty();
    }

    public List<File> getAdded() {
        return added;
    }

    public void setAdded(List<File> added) {
        this.added = added;
    }

    public List<File> getRemoved() {
        return removed;
    }

    public void setRemoved(List<File> removed) {
        this.removed = removed;
    }

    public Map<String, File[]> getChanged() {
        return changed;
    }

    public void setChanged(Map<String, File[]> changed) {
        this.changed = changed;
    }

    public List<File> getUnchanged() {
        return unchanged;
    }

    public void setUnchanged(List<File> unchanged) {
        this.unchanged = unchanged;
    }
}
