package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private List<Site> sites = new ArrayList<>();

    public List<Site> getSites() {
        return List.copyOf(sites);
    }

    public void sellSite(Site site) {
        if (site == null) {
            throw new IllegalArgumentException();
        }
        sites.add(site);
    }

    public int nrOfLastSold() {
        int side = sites.isEmpty() ? 0 : sites.get(sites.size() - 1).getSide();
        int lastSold = 0;
        for (Site site: sites) {
            if (site.getSide() == side) {
                lastSold = lastSold + 2;
            }
        }
        lastSold = (side == 0 ? lastSold : lastSold - 1); // When no sold house return 0
        return lastSold;
    }

    public List<String> getStatsByFence() {
        makeStat();
        List<Fence> fences = List.of(Fence.values());
        List<String> result = new ArrayList<>();
        for (Fence fence: fences) {
            result.add(fence.toString());
        }
        clearStat();
        return result;
    }

    private void makeStat() {
        for (Site site: sites) {
            Fence fence = site.getFence();
            fence.setSold(fence.getSold() + 1);
        }
    }

    private void clearStat() {
        for (Site site: sites) {
            Fence fence = site.getFence();
            fence.setSold(0);
        }
    }
}
