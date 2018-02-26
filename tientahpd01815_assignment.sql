-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2017 at 06:37 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tientahpd01815_assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `IDCmt` int(10) NOT NULL,
  `MaSP` int(10) NOT NULL,
  `IdTaiKhoan` int(10) NOT NULL,
  `NoiDung` text COLLATE utf8_vietnamese_ci NOT NULL,
  `TraLoi` int(10) NOT NULL,
  `TrangThai` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `giohang`
--

CREATE TABLE `giohang` (
  `IdTaiKhoan` int(10) NOT NULL,
  `MaSP` int(10) NOT NULL,
  `SoLuong` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `giohang`
--

INSERT INTO `giohang` (`IdTaiKhoan`, `MaSP`, `SoLuong`) VALUES
(2, 9, 6);

-- --------------------------------------------------------

--
-- Table structure for table `loaisp`
--

CREATE TABLE `loaisp` (
  `MaLoaiSP` int(10) NOT NULL,
  `TenLoaiSP` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `loaisp`
--

INSERT INTO `loaisp` (`MaLoaiSP`, `TenLoaiSP`) VALUES
(1, 'Phone'),
(2, 'Tablet'),
(3, 'Laptop');

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSP` int(10) NOT NULL,
  `MaLoaiSP` int(10) DEFAULT NULL,
  `TenSP` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `Gia` double DEFAULT NULL,
  `CongNgheMH` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `DoPhanGiai` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `KichThuocMH` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `MatCamUng` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `CamSau` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `QuayPhim` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `DenFlash` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `ChupNangCao` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `CamTruoc` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `VideoCall` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `InfoThem` varchar(300) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `HDH` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `Chip` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `TocDoCPU` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `ChipDoHoa` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `RAM` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `BoNhoTrong` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `Wifi` varchar(100) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `Bluetooth` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `CongKetNoi` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `KetNoiKhac` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `ThietKe` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `ChatLieu` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `KichThuoc` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `DLPin` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `LoaiPin` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `CongNghePin` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `BaoMatNC` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `TinhNangNew` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `NgayRaMat` date DEFAULT NULL,
  `CNAmThanh` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `TrongLuong` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `SoLuong` int(10) DEFAULT NULL,
  `ChuThich` text COLLATE utf8_vietnamese_ci,
  `linkAnh` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `TrangThai` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `LinkAnhBia` varchar(200) COLLATE utf8_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `MaLoaiSP`, `TenSP`, `Gia`, `CongNgheMH`, `DoPhanGiai`, `KichThuocMH`, `MatCamUng`, `CamSau`, `QuayPhim`, `DenFlash`, `ChupNangCao`, `CamTruoc`, `VideoCall`, `InfoThem`, `HDH`, `Chip`, `TocDoCPU`, `ChipDoHoa`, `RAM`, `BoNhoTrong`, `Wifi`, `Bluetooth`, `CongKetNoi`, `KetNoiKhac`, `ThietKe`, `ChatLieu`, `KichThuoc`, `DLPin`, `LoaiPin`, `CongNghePin`, `BaoMatNC`, `TinhNangNew`, `NgayRaMat`, `CNAmThanh`, `TrongLuong`, `SoLuong`, `ChuThich`, `linkAnh`, `TrangThai`, `LinkAnhBia`) VALUES
(1, 1, 'Samsung Galaxy J7 Pro', 6990000, 'Super AMOLED', 'Full HD (1080 x 1920 pixels)', '5.5\"', 'Kính cường lực Gorilla Glass 4', '13 MP', 'Có quay phim', 'Có', 'Tự động lấy nét, Chạm lấy nét, Nhận diện khuôn mặt, HDR, Panorama, Chế độ chụp chuyên nghiệp', '13 MP', 'Có', 'Camera góc rộng, Chế độ làm đẹp, Selfie bằng cử chỉ, Nhận diện khuôn mặt', 'Android 7.0', 'Exynos 7870 8 nhân 64-bit', '1.6 GHz', 'Mali-T830', '3 GB', '32 GB', 'Wi-Fi 802.11 b/g/n, Wi-Fi hotspot', 'Có', 'Micro USB', 'OTG', 'Nguyên khối, mặt kính cong 2.5D', 'Hợp kim nhôm', 'Dài 152.4mm - Rộng 74.7m - Dày 7.9mm', '3600 mAh', 'Pin chuẩn Li-Ion', 'Tiết kiệm pin', 'Mở khóa bằng vân tay', 'Mặt kính 2.5D', '2017-06-01', 'Lossless, MP3, WAV, WMA', '181 g', 16, '<h1>Test chương tr&igrave;nh</h1>\r\n\r\n<p>chương tr&igrave;nh đang trong qu&aacute; tr&igrave;nh ho&agrave;n thiện</p>', '', 'installment', ''),
(9, 1, 'iPhone 7 Plus 128GB', 22990000, 'LED-backlit IPS LCD', 'Full HD (1080 x 1920 pixels)', '5.5\"', 'Kính oleophobic (ion cường lực)', '2 camera 12 MP', 'Quay phim 4K 2160p@30fps', '4 đèn LED (2 tông màu)', 'Tự động lấy nét, Chạm lấy nét, Nhận diện khuôn mặt, HDR, Panorama, Chống rung quang học (OIS)', '7 MP', 'Hỗ trợ VideoCall thông qua ứng dụng', 'Selfie ngược sáng HDR, Tự động lấy nét, Nhận diện khuôn mặt, Quay video Full HD', 'iOS 10', 'Apple A10 Fusion 4 nhân 64-bit', '2.3 GHz', 'Chip đồ họa 6 nhân', '3 GB', '128 GB', 'Wi-Fi 802.11 a/b/g/n/ac, Dual-band, Wi-Fi hotspot', 'v4.2, A2DP, LE', 'Lightning', 'NFC, Air Play, OTG, HDMI', 'Nguyên khối, mặt kính cong 2.5D', 'Hợp kim Nhôm + Magie', 'Dài 158.2 mm - Ngang 77.9 mm - Dày 7.3 mm', '2900 mAh', 'Pin chuẩn Li-Ion', 'Tiết kiệm pin', 'Mở khóa bằng vân tay', 'Chống nước, chống bụi 3D Touch', '2016-11-01', 'Lossless, Midi, MP3, WAV, WMA, AAC, AAC++', '188 g', 15, '<h2><strong>Với thiết kế kh&ocirc;ng qu&aacute; nhiều thay đổi, vẫn bảo tồn vẻ đẹp truyền thống từ thời Iphone 6 Plus, &nbsp;iPhone 7 Plus&nbsp;được trang bị nhiều n&acirc;ng cấp đ&aacute;ng gi&aacute; như camera k&eacute;p, đạt chuẩn chống nước chống bụi c&ugrave;ng cấu h&igrave;nh cực mạnh.</strong></h2>\r\n\r\n<p style=\"text-align:center\"><strong><img alt=\"\" src=\"https://cdn3.tgdd.vn/Products/Images/42/87840/iphone-7-plus-256gb1-1.jpg\" style=\"height:395px; width:640px\" /></strong></p>\r\n\r\n<p>Thay đổi d&atilde;y nhựa an-ten bắt s&oacute;ng được đưa v&ograve;ng l&ecirc;n tr&ecirc;n thay v&igrave; cắt ngang ở mặt lưng như trước.</p>\r\n\r\n<p style=\"text-align:center\"><img alt=\"\" src=\"https://cdn.tgdd.vn/Products/Images/42/87840/iphone-7-plus-256gb2-1.jpg\" style=\"height:390px; width:640px\" /></p>\r\n\r\n<p>N&uacute;t Home quen thuộc kh&ocirc;ng c&ograve;n l&agrave; ph&iacute;m vật l&yacute; nữa m&agrave; được thay thế bằng cảm ứng, n&oacute; sẽ rung l&ecirc;n khi bạn ấn. V&igrave; đ&atilde; d&ugrave;ng iPhone một thời gian rất d&agrave;i, n&ecirc;n t&ocirc;i c&ocirc;ng nhận rằng hơi kh&oacute; để l&agrave;m quen với n&oacute;, nhưng c&oacute; lẽ chỉ mất v&agrave;i ng&agrave;y th&ocirc;i.</p>\r\n\r\n<p style=\"text-align:center\"><img alt=\"\" src=\"https://cdn2.tgdd.vn/Products/Images/42/87840/iphone-7-plus-256gb3-1.jpg\" style=\"height:395px; width:640px\" /></p>\r\n', '_anh.jpg', 'new', '_anhbia.jpg'),
(10, 1, 'Samsung Galaxy Note 8', 22490000, 'Super AMOLED', '2K (1440 x 2960 Pixels)', '6.3\"', 'Corning Gorilla Glass 5', '2 camera 12 MP', 'Quay phim 4K 2160p@30fps', 'Có', 'Chế độ Zoom (Camera kép), Chụp ảnh xóa phông, Chạm lấy nét, Nhận diện khuôn mặt, HDR, Panorama, Chống rung quang học (OIS)', '8 MP', 'Có', 'Selfie ngược sáng HDR, Camera góc rộng, Chế độ làm đẹp, Nhận diện khuôn mặt, Selfie bằng cử chỉ, Chụp bằng giọng nói', 'Android 7.1', 'Exynos 8895 8 nhân 64-bit', '4 nhân 2.3 GHz và 4 nhân 1.7 GHz', 'Mali-G71 MP20', '6 GB', '64 GB', 'Wi-Fi 802.11 a/b/g/n/ac, Dual-band, DLNA, Wi-Fi Direct, Wi-Fi hotspot', 'v5.0, apt-X, A2DP, LE, EDR', 'USB Type-C', 'NFC, Kết nối nhanh™, OTG, Miracast', 'Nguyên khối', 'Khung kim loại + mặt kính cường lực', 'Dài 162,5 mm - Ngang 74,8 mm - Dày 8,6 mm', '3300 mAh', 'Pin chuẩn Li-Ion', 'Sạc pin nhanh, Sạc pin không dây, Siêu tiết kiệm pin', 'Mở khóa bằng khuôn mặt, Mở khóa bằng vân tay, Quét mống mắt', 'Chống nước, chống bụi', '2017-08-01', 'Midi, Lossless, MP3, WAV, WMA, AAC++, eAAC+, OGG, AC3, FLAC', '195 g', 35, '<h1><strong>Galaxy Note 8 l&agrave; niềm hy vọng vực lại d&ograve;ng Note danh tiếng của Samsung với diện mạo nam t&iacute;nh, sang trọng. Trang bị camera k&eacute;p x&oacute;a ph&ocirc;ng thời thượng, m&agrave;n h&igrave;nh v&ocirc; cực như tr&ecirc;n S8 Plus, b&uacute;t Spen với nhiều t&iacute;nh năng mới v&agrave; nhiều c&ocirc;ng nghệ được Samsung ưu &aacute;i đem l&ecirc;n Note 8.</strong></h1>\r\n\r\n<p style=\"text-align:center\"><strong><img alt=\"\" src=\"https://cdn.tgdd.vn/Files/2017/09/09/1020228/z764741777150_ea3f044fdfc5223e3e5b0c82a4a331f0-_2560x1920-800-resize.jpg\" style=\"height:600px; width:800px\" /></strong></p>\r\n\r\n<p>D&ugrave; được giới thiệu l&agrave; m&agrave;n h&igrave;nh l&ecirc;n tới 6.3 inch nhưng thực sự m&aacute;y khi cầm tr&ecirc;n tay rất nhỏ gọn nhờ v&agrave;o c&ocirc;ng nghệ &quot;m&agrave;n h&igrave;nh v&ocirc; cực&quot; ti&ecirc;n tiến nhất hiện nay của Samsung.</p>\r\n\r\n<p style=\"text-align:center\"><img alt=\"\" src=\"https://cdn2.tgdd.vn/Files/2017/09/09/1020228/z764741903200_347a0ee08cf7acf973047629cf2c29ac-_2560x1920-800-resize.jpg\" style=\"height:600px; width:800px\" /></p>\r\n\r\n<p>C&aacute;c cạnh b&ecirc;n m&aacute;y được l&agrave;m cong đều khiến m&igrave;nh khi cầm c&oacute; cảm gi&aacute;c &ocirc;m tay rất thoải m&aacute;i v&agrave; kh&ocirc;ng hề bị cấn.</p>\r\n', 'null_anh.jpg', 'new', 'null_anhbia.jpg'),
(11, 1, 'Samsung Galaxy J7+', 8690000, 'Super AMOLED', 'Full HD (1080 x 1920 pixels)', '5.5', 'Kính cường lực', '13 MP và 5 MP (2 camera)', 'Quay phim FullHD 1080p@30fps', 'Có', 'Chụp ảnh xóa phông, Tự động lấy nét, Chạm lấy nét, Nhận diện khuôn mặt, HDR, Panorama', 'Chụp ảnh xóa phông, Tự động lấy nét, Chạm lấy nét, Nhận diện khuôn mặt, HDR, Panorama', 'Có', 'Nhận diện khuôn mặt, Quay video Full HD, Camera góc rộng, Chế độ làm đẹp', 'Android 7.0', 'Qualcomm Snapdragon 450', '4 nhân 2.39 GHz & 4 nhân 1.69 GHz', 'Mali-T880MP2', '4 GB', '32 GB', 'Wi-Fi 802.11 b/g/n, Wi-Fi Direct, Wi-Fi hotspot', 'v4.2, A2DP, LE', 'Micro USB', 'OTG', 'Nguyên khối', 'Kim loại', 'Dài 155.9 mm - Ngang 75.8 mm - Dày 7.7 mm', '3000 mAh', 'Pin chuẩn Li-Ion', 'Siêu tiết kiệm pin', 'Mở khóa bằng vân tay, Mở khóa bằng khuôn mặt', 'Không', '2017-10-28', 'Lossless, Midi, MP3, WAV, WMA, WMA9, AAC, AAC+, AAC++, eAAC+', '180 g', 24, '<h3>Thiết kế cao cấp</h3>\r\n\r\n<p>Samsung Galaxy J7+ tiếp tục được sử dụng thiết kế nguy&ecirc;n khối từ kim loại như c&aacute;c d&ograve;ng cao cấp, mang lại vẻ đẹp sang trọng cũng như bền bỉ nhất.</p>\r\n\r\n<p style=\"text-align:center\"><img alt=\"\" src=\"https://cdn3.tgdd.vn/Products/Images/42/112970/samsung-galaxy-j7-plus-a32.jpg\" style=\"height:427px; width:640px\" /></p>\r\n\r\n<p>Dải anten trở lại với thiết kế quen thuộc trước đ&acirc;y chứ kh&ocirc;ng c&aacute;ch điệu như tr&ecirc;n J7 Pro. Cụm camera k&eacute;p đặt theo chiều dọc kh&aacute; nổi bật tr&ecirc;n mặt lưng m&aacute;y.</p>\r\n\r\n<p style=\"text-align:center\"><img alt=\"\" src=\"https://cdn.tgdd.vn/Products/Images/42/112970/samsung-galaxy-j7-plus-a4.jpg\" style=\"height:360px; width:640px\" /></p>\r\n', '_anh.jpg', NULL, '_anhbia.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `IDTaiKhoan` int(10) NOT NULL,
  `TenTaiKhoan` varchar(20) COLLATE utf8_vietnamese_ci NOT NULL,
  `MatKhau` varchar(20) COLLATE utf8_vietnamese_ci NOT NULL,
  `ChucVu` varchar(20) COLLATE utf8_vietnamese_ci NOT NULL,
  `TenNguoiDung` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8_vietnamese_ci NOT NULL,
  `DiaChi` varchar(100) COLLATE utf8_vietnamese_ci NOT NULL,
  `SDT` varchar(15) COLLATE utf8_vietnamese_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`IDTaiKhoan`, `TenTaiKhoan`, `MatKhau`, `ChucVu`, `TenNguoiDung`, `NgaySinh`, `GioiTinh`, `DiaChi`, `SDT`, `Email`) VALUES
(1, 'admin', 'admin', 'Administrator', 'Admin', '1995-03-23', 'Nam', '36 Nguyễn Phước Thái', '0966575492', 'tientahpd01815@fpt.edu.vn'),
(2, 'tien', '123456', 'User', 'Trần Anh Hưng Tiến', '1995-03-23', 'Nam', '36 Nguyễn Phước Thái', '0966575492', 'tientahpd01815@fpt.edu.vn'),
(6, 'hieu', '123456', 'User', 'Lê Anh Hiệu', '2017-10-22', 'Nam', '36 Nguyễn Phước Thái', '11234567890', 'hieu@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`IDCmt`),
  ADD KEY `MaSP` (`MaSP`),
  ADD KEY `IdTaiKhoan` (`IdTaiKhoan`);

--
-- Indexes for table `giohang`
--
ALTER TABLE `giohang`
  ADD KEY `IdTaiKhoan` (`IdTaiKhoan`),
  ADD KEY `MaSP` (`MaSP`);

--
-- Indexes for table `loaisp`
--
ALTER TABLE `loaisp`
  ADD PRIMARY KEY (`MaLoaiSP`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSP`),
  ADD KEY `MaLoaiSP` (`MaLoaiSP`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`IDTaiKhoan`),
  ADD UNIQUE KEY `TenTaiKhoan` (`TenTaiKhoan`),
  ADD UNIQUE KEY `TenTaiKhoan_2` (`TenTaiKhoan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `IDCmt` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loaisp`
--
ALTER TABLE `loaisp`
  MODIFY `MaLoaiSP` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MaSP` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `IDTaiKhoan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`MaSP`) REFERENCES `sanpham` (`MaSP`),
  ADD CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`IdTaiKhoan`) REFERENCES `taikhoan` (`IDTaiKhoan`);

--
-- Constraints for table `giohang`
--
ALTER TABLE `giohang`
  ADD CONSTRAINT `giohang_ibfk_1` FOREIGN KEY (`IdTaiKhoan`) REFERENCES `taikhoan` (`IDTaiKhoan`),
  ADD CONSTRAINT `giohang_ibfk_2` FOREIGN KEY (`MaSP`) REFERENCES `sanpham` (`MaSP`);

--
-- Constraints for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaLoaiSP`) REFERENCES `loaisp` (`MaLoaiSP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
