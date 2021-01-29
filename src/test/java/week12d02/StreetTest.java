package week12d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    @Test
    void testNoSold() {
        assertEquals(0, new Street().nrOfLastSold());
    }

    @Test
    void testStreet() {
        Street street = new Street();
        List<Site> sites = List.of(new Site(0, 10, Fence.PERFECT), new Site(0, 7, Fence.NEED_UPGRADE), new Site(1, 12, Fence.NEED_UPGRADE), new Site(0, 9, Fence.PERFECT), new Site(0, 11, Fence.NO_FENCE), new Site(1, 13, Fence.PERFECT));
        for (Site site: sites) {
               street.sellSite(site);
        }
        assertEquals(3, street.nrOfLastSold());
    }

    @Test
    void testSites() {
        Street street = new Street();
        List<Site> sites = List.of(new Site(0, 10, Fence.PERFECT), new Site(0, 7, Fence.NEED_UPGRADE), new Site(1, 12, Fence.NEED_UPGRADE), new Site(0, 9, Fence.PERFECT), new Site(0, 11, Fence.NO_FENCE), new Site(1, 13, Fence.PERFECT));
        for (Site site: sites) {
            street.sellSite(site);
        }
        assertEquals(sites, street.getSites());

    }

    @Test
    void testStatisticsEmpty() {
        Street street = new Street();
        assertEquals(List.of("0 PERFECT", "0 NEED_UPGRADE", "0 NO_FENCE"), street.getStatsByFence());
    }

    @Test
    void testStatistics() {
        Street street = new Street();
        List<Site> sites = List.of(new Site(0, 10, Fence.PERFECT), new Site(0, 7, Fence.NEED_UPGRADE), new Site(1, 12, Fence.NEED_UPGRADE), new Site(0, 9, Fence.PERFECT), new Site(0, 11, Fence.NO_FENCE), new Site(1, 13, Fence.PERFECT));
        for (Site site: sites) {
            street.sellSite(site);
        }
        assertEquals(List.of("3 PERFECT", "2 NEED_UPGRADE", "1 NO_FENCE"), street.getStatsByFence());
    }



}