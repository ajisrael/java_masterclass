public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0d || height <= 0d || areaPerBucket <= 0d || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        int bucketsRequired = (int) Math.ceil(area / areaPerBucket);

        return bucketsRequired - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0d || areaPerBucket <= 0d) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
