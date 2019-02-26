clc;    % Clear the command window.
close all;  % Close all figures (except those of imtool.)
workspace;  % Make sure the workspace panel is showing.
format long g;
format compact;
fontSize = 20;
grayImage = imread('cameraman.tif');
% Display the original gray scale image.
subplot(3, 1, 1);
imshow(grayImage, []);
title('Original Grayscale Image', 'FontSize', fontSize);
% Enlarge figure to full screen.
set(gcf, 'Units', 'Normalized', 'OuterPosition', [0 0 1 1]);
% Give a name to the title bar.
set(gcf, 'Name', 'Demo by ImageAnalyst', 'NumberTitle', 'Off') 
upperPixelImage = triu(grayImage); % 2D image
% Display the original gray scale image.
subplot(3, 1, 2);
imshow(upperPixelImage, []);
title('Upper Triangle', 'FontSize', fontSize);
% Get the 1-D list of upper values.
mask = triu(ones(size(grayImage))) > 0;
upperList = upperPixelImage(mask);
lowerPixelImage = tril(grayImage); % 2D image
% Display the original gray scale image.
subplot(3, 1, 3);
imshow(lowerPixelImage, []);
title('Lower Triangle', 'FontSize', fontSize);
% Get the 1-D list of lower values.
mask = tril(ones(size(grayImage))) > 0;
lowerList = lowerPixelImage(mask);