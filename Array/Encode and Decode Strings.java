class Solution {

    // encode list<String> thành 1 chuỗi
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    // decode chuỗi thành list<String>
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            // tìm dấu #
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            j++; // bỏ qua dấu #

            // lấy đúng length ký tự
            String word = str.substring(j, j + length);
            list.add(word);

            // nhảy tới vị trí tiếp theo
            i = j + length;
        }

        return list;
    }
}
